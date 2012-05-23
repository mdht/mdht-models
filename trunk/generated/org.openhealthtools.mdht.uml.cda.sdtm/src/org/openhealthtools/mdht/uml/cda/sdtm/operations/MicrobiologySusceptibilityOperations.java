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
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microbiology Susceptibility</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityBaselineIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityDerivedDataIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getBaselineIndicator() <em>Get Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getDerivedDataIndicator() <em>Get Derived Data Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicrobiologySusceptibilityOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MicrobiologySusceptibilityOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.39')";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.39')
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityId(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityBaselineIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityBaselineIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityBaselineIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Baseline Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityBaselineIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityBaselineIndicator(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_BASELINE_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityBaselineIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityDerivedDataIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityDerivedDataIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityDerivedDataIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Derived Data Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilityDerivedDataIndicator(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilityDerivedDataIndicator(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_DERIVED_DATA_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityDerivedDataIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
      try
      {
        VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySusceptibility))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
             new Object [] { microbiologySusceptibility }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEventStudyDay(MicrobiologySusceptibility) <em>Get Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)";

  /**
   * The cached OCL query for the '{@link #getEventStudyDay(MicrobiologySusceptibility) <em>Get Event Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EventStudyDay getEventStudyDay(MicrobiologySusceptibility microbiologySusceptibility)
  {
    if (GET_EVENT_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(68));
      try
      {
        GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
    return (EventStudyDay) query.evaluate(microbiologySusceptibility);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(MicrobiologySusceptibility) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(MicrobiologySusceptibility) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(MicrobiologySusceptibility microbiologySusceptibility)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(69));
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
    return (TimingReference) query.evaluate(microbiologySusceptibility);
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(MicrobiologySusceptibility) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(MicrobiologySusceptibility) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(MicrobiologySusceptibility microbiologySusceptibility)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(70));
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
    return (GroupIdentifier) query.evaluate(microbiologySusceptibility);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(MicrobiologySusceptibility) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(MicrobiologySusceptibility) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(MicrobiologySusceptibility microbiologySusceptibility)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(71));
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
    return (NonPerformanceReason) query.evaluate(microbiologySusceptibility);
  }

  /**
   * The cached OCL expression body for the '{@link #getBaselineIndicator(MicrobiologySusceptibility) <em>Get Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static final String GET_BASELINE_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)";

  /**
   * The cached OCL query for the '{@link #getBaselineIndicator(MicrobiologySusceptibility) <em>Get Baseline Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BASELINE_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BaselineIndicator getBaselineIndicator(MicrobiologySusceptibility microbiologySusceptibility)
  {
    if (GET_BASELINE_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(72));
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
    return (BaselineIndicator) query.evaluate(microbiologySusceptibility);
  }

  /**
   * The cached OCL expression body for the '{@link #getDerivedDataIndicator(MicrobiologySusceptibility) <em>Get Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static final String GET_DERIVED_DATA_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)";

  /**
   * The cached OCL query for the '{@link #getDerivedDataIndicator(MicrobiologySusceptibility) <em>Get Derived Data Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(MicrobiologySusceptibility)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DERIVED_DATA_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)
   * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DerivedDataIndicator getDerivedDataIndicator(MicrobiologySusceptibility microbiologySusceptibility)
  {
    if (GET_DERIVED_DATA_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(73));
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
    return (DerivedDataIndicator) query.evaluate(microbiologySusceptibility);
  }

} // MicrobiologySusceptibilityOperations