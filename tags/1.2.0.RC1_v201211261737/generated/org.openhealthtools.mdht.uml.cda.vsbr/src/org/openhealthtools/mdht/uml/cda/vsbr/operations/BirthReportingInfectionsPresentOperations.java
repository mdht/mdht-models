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

import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Reporting Infections Present</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent#validateBirthReportingInfectionsPresentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent#validateBirthReportingInfectionsPresentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent#validateBirthReportingInfectionsPresentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent#validateBirthReportingInfectionsPresentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent#validateBirthReportingInfectionsPresentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BirthReportingInfectionsPresentOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BirthReportingInfectionsPresentOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingInfectionsPresentTemplateId(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentTemplateId(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.13')";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingInfectionsPresentTemplateId(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentTemplateId(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.13')
   * @param birthReportingInfectionsPresent The receiving '<em><b>Birth Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingInfectionsPresentTemplateId(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingInfectionsPresentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingInfectionsPresent, context) }),
             new Object [] { birthReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingInfectionsPresentClassCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentClassCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingInfectionsPresentClassCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentClassCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param birthReportingInfectionsPresent The receiving '<em><b>Birth Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingInfectionsPresentClassCode(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingInfectionsPresentClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingInfectionsPresent, context) }),
             new Object [] { birthReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingInfectionsPresentCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingInfectionsPresentCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param birthReportingInfectionsPresent The receiving '<em><b>Birth Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingInfectionsPresentCode(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingInfectionsPresentCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingInfectionsPresent, context) }),
             new Object [] { birthReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingInfectionsPresentMoodCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentMoodCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingInfectionsPresentMoodCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentMoodCode(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param birthReportingInfectionsPresent The receiving '<em><b>Birth Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingInfectionsPresentMoodCode(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingInfectionsPresentMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingInfectionsPresent, context) }),
             new Object [] { birthReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingInfectionsPresentValue(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentValue(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingInfectionsPresentValue(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Infections Present Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingInfectionsPresentValue(BirthReportingInfectionsPresent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param birthReportingInfectionsPresent The receiving '<em><b>Birth Reporting Infections Present</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingInfectionsPresentValue(BirthReportingInfectionsPresent birthReportingInfectionsPresent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_INFECTIONS_PRESENT);
      try
      {
        VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingInfectionsPresent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_INFECTIONS_PRESENT__BIRTH_REPORTING_INFECTIONS_PRESENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingInfectionsPresentValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingInfectionsPresent, context) }),
             new Object [] { birthReportingInfectionsPresent }));
      }
       
      return false;
    }
    return true;
  }

} // BirthReportingInfectionsPresentOperations