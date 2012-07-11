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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Death Reporting Infections Present</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent#validateFetalDeathReportingInfectionsPresentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent#validateFetalDeathReportingInfectionsPresentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent#validateFetalDeathReportingInfectionsPresentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent#validateFetalDeathReportingInfectionsPresentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent#validateFetalDeathReportingInfectionsPresentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetalDeathReportingInfectionsPresentOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetalDeathReportingInfectionsPresentOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingInfectionsPresentTemplateId(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentTemplateId(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.19')";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingInfectionsPresentTemplateId(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentTemplateId(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.19')
   * @param fetalDeathReportingInfectionsPresent The receiving '<em><b>Fetal Death Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingInfectionsPresentTemplateId(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingInfectionsPresentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingInfectionsPresent, context) }),
             new Object [] { fetalDeathReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingInfectionsPresentClassCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentClassCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingInfectionsPresentClassCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentClassCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param fetalDeathReportingInfectionsPresent The receiving '<em><b>Fetal Death Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingInfectionsPresentClassCode(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingInfectionsPresentClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingInfectionsPresent, context) }),
             new Object [] { fetalDeathReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingInfectionsPresentCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingInfectionsPresentCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param fetalDeathReportingInfectionsPresent The receiving '<em><b>Fetal Death Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingInfectionsPresentCode(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingInfectionsPresentCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingInfectionsPresent, context) }),
             new Object [] { fetalDeathReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingInfectionsPresentMoodCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentMoodCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingInfectionsPresentMoodCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentMoodCode(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param fetalDeathReportingInfectionsPresent The receiving '<em><b>Fetal Death Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingInfectionsPresentMoodCode(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingInfectionsPresentMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingInfectionsPresent, context) }),
             new Object [] { fetalDeathReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingInfectionsPresentValue(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentValue(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingInfectionsPresentValue(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Infections Present Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingInfectionsPresentValue(FetalDeathReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param fetalDeathReportingInfectionsPresent The receiving '<em><b>Fetal Death Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingInfectionsPresentValue(FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__FETAL_DEATH_REPORTING_INFECTIONS_PRESENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingInfectionsPresentValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingInfectionsPresent, context) }),
             new Object [] { fetalDeathReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

} // FetalDeathReportingInfectionsPresentOperations