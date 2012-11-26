/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

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

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.Height;
import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes;
import org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionPreNatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Birth Reporting Infections Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getPreNatalCare() <em>Get Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getHeight() <em>Get Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getDateofLastLiveBirth() <em>Get Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getLastMenstrualPeriodDate() <em>Get Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getNumberofBirthsStillLiving() <em>Get Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getNumberofLiveBirthsnowDead() <em>Get Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getOtherPreganancyOutcomes() <em>Get Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getRiskFactors() <em>Get Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection#getBirthReportingInfectionsPresents() <em>Get Birth Reporting Infections Presents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BirthReportingPrenatalExperienceSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BirthReportingPrenatalExperienceSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionTemplateId(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionTemplateId(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.3')";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionTemplateId(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionTemplateId(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.3')
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionTemplateId(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionClassCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionClassCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionClassCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionClassCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::DOCSECT
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionClassCode(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionCode(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionMoodCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionMoodCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionMoodCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionMoodCode(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionMoodCode(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionText(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionText(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionText(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionText(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionText(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionPreNatalCare(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Pre Natal Care</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionPreNatalCare(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Pre-Natal Care) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionPreNatalCare(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Pre Natal Care</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionPreNatalCare(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Pre-Natal Care) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionPreNatalCare(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionPreNatalCare", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionHeight(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Height</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionHeight(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Height) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionHeight(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Height</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionHeight(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Height) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionHeight(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionHeight", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Dateof Last Live Birth</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Date of Last Live Birth) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Dateof Last Live Birth</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Date of Last Live Birth) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionDateofLastLiveBirth", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Last Menstrual Period Date</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Last Menstrual Period Date) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Last Menstrual Period Date</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Last Menstrual Period Date) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_LAST_MENSTRUAL_PERIOD_DATE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Births Still Living</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Births Still Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Births Still Living</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Births Still Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Live Births now Dead) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Live Births now Dead) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionRiskFactor(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Risk Factor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionRiskFactor(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionRiskFactor(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Risk Factor</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionRiskFactor(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionRiskFactor(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionRiskFactor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Birth Reporting Infections Present</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Reporting Prenatal Experience Section Birth Reporting Infections Present</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(BirthReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION__BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION_BIRTH_REPORTING_INFECTIONS_PRESENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(birthReportingPrenatalExperienceSection, context) }),
             new Object [] { birthReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getPreNatalCare(BirthReportingPrenatalExperienceSection) <em>Get Pre Natal Care</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreNatalCare(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_NATAL_CARE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Pre-Natal Care))->asSequence()->any(true).oclAsType(vsbr::Pre-Natal Care)";

  /**
   * The cached OCL query for the '{@link #getPreNatalCare(BirthReportingPrenatalExperienceSection) <em>Get Pre Natal Care</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreNatalCare(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_NATAL_CARE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Pre-Natal Care))->asSequence()->any(true).oclAsType(vsbr::Pre-Natal Care)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  PreNatalCare getPreNatalCare(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_PRE_NATAL_CARE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(69));
      try
      {
        GET_PRE_NATAL_CARE__EOCL_QRY = helper.createQuery(GET_PRE_NATAL_CARE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRE_NATAL_CARE__EOCL_QRY);
    return (PreNatalCare) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getHeight(BirthReportingPrenatalExperienceSection) <em>Get Height</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_HEIGHT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Height))->asSequence()->any(true).oclAsType(vsbr::Height)";

  /**
   * The cached OCL query for the '{@link #getHeight(BirthReportingPrenatalExperienceSection) <em>Get Height</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HEIGHT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Height))->asSequence()->any(true).oclAsType(vsbr::Height)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Height getHeight(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_HEIGHT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(70));
      try
      {
        GET_HEIGHT__EOCL_QRY = helper.createQuery(GET_HEIGHT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HEIGHT__EOCL_QRY);
    return (Height) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getDateofLastLiveBirth(BirthReportingPrenatalExperienceSection) <em>Get Dateof Last Live Birth</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateofLastLiveBirth(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_DATEOF_LAST_LIVE_BIRTH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Date of Last Live Birth))->asSequence()->any(true).oclAsType(vsbr::Date of Last Live Birth)";

  /**
   * The cached OCL query for the '{@link #getDateofLastLiveBirth(BirthReportingPrenatalExperienceSection) <em>Get Dateof Last Live Birth</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateofLastLiveBirth(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Date of Last Live Birth))->asSequence()->any(true).oclAsType(vsbr::Date of Last Live Birth)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DateofLastLiveBirth getDateofLastLiveBirth(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(71));
      try
      {
        GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY = helper.createQuery(GET_DATEOF_LAST_LIVE_BIRTH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY);
    return (DateofLastLiveBirth) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection) <em>Get Last Menstrual Period Date</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Last Menstrual Period Date))->asSequence()->any(true).oclAsType(vsbr::Last Menstrual Period Date)";

  /**
   * The cached OCL query for the '{@link #getLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection) <em>Get Last Menstrual Period Date</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Last Menstrual Period Date))->asSequence()->any(true).oclAsType(vsbr::Last Menstrual Period Date)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  LastMenstrualPeriodDate getLastMenstrualPeriodDate(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(72));
      try
      {
        GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY = helper.createQuery(GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY);
    return (LastMenstrualPeriodDate) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection) <em>Get Numberof Births Still Living</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Births Still Living))->asSequence()->any(true).oclAsType(vsbr::Number of Births Still Living)";

  /**
   * The cached OCL query for the '{@link #getNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection) <em>Get Numberof Births Still Living</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Births Still Living))->asSequence()->any(true).oclAsType(vsbr::Number of Births Still Living)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NumberofBirthsStillLiving getNumberofBirthsStillLiving(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(73));
      try
      {
        GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY = helper.createQuery(GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY);
    return (NumberofBirthsStillLiving) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection) <em>Get Numberof Live Birthsnow Dead</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Live Births now Dead))->asSequence()->any(true).oclAsType(vsbr::Number of Live Births now Dead)";

  /**
   * The cached OCL query for the '{@link #getNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection) <em>Get Numberof Live Birthsnow Dead</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Live Births now Dead))->asSequence()->any(true).oclAsType(vsbr::Number of Live Births now Dead)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NumberofLiveBirthsnowDead getNumberofLiveBirthsnowDead(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(74));
      try
      {
        GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY = helper.createQuery(GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY);
    return (NumberofLiveBirthsnowDead) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection) <em>Get Other Preganancy Outcomes</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_OTHER_PREGANANCY_OUTCOMES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes))->asSequence()->any(true).oclAsType(vsbr::Other Pregnancy Outcomes)";

  /**
   * The cached OCL query for the '{@link #getOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection) <em>Get Other Preganancy Outcomes</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_OTHER_PREGANANCY_OUTCOMES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes))->asSequence()->any(true).oclAsType(vsbr::Other Pregnancy Outcomes)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  OtherPregnancyOutcomes getOtherPreganancyOutcomes(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_OTHER_PREGANANCY_OUTCOMES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(75));
      try
      {
        GET_OTHER_PREGANANCY_OUTCOMES__EOCL_QRY = helper.createQuery(GET_OTHER_PREGANANCY_OUTCOMES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_PREGANANCY_OUTCOMES__EOCL_QRY);
    return (OtherPregnancyOutcomes) query.evaluate(birthReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getRiskFactors(BirthReportingPrenatalExperienceSection) <em>Get Risk Factors</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskFactors(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_RISK_FACTORS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present)).oclAsType(vsbr::Birth Reporting - Infections Present)";

  /**
   * The cached OCL query for the '{@link #getRiskFactors(BirthReportingPrenatalExperienceSection) <em>Get Risk Factors</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskFactors(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_RISK_FACTORS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present)).oclAsType(vsbr::Birth Reporting - Infections Present)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<BirthReportingInfectionsPresent> getRiskFactors(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_RISK_FACTORS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(76));
      try
      {
        GET_RISK_FACTORS__EOCL_QRY = helper.createQuery(GET_RISK_FACTORS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RISK_FACTORS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<BirthReportingInfectionsPresent> result = (Collection<BirthReportingInfectionsPresent>) query.evaluate(birthReportingPrenatalExperienceSection);
    return new BasicEList.UnmodifiableEList<BirthReportingInfectionsPresent>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getBirthReportingInfectionsPresents(BirthReportingPrenatalExperienceSection) <em>Get Birth Reporting Infections Presents</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthReportingInfectionsPresents(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_BIRTH_REPORTING_INFECTIONS_PRESENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present)).oclAsType(vsbr::Birth Reporting - Infections Present)";

  /**
   * The cached OCL query for the '{@link #getBirthReportingInfectionsPresents(BirthReportingPrenatalExperienceSection) <em>Get Birth Reporting Infections Presents</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthReportingInfectionsPresents(BirthReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BIRTH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present)).oclAsType(vsbr::Birth Reporting - Infections Present)
   * @param birthReportingPrenatalExperienceSection The receiving '<em><b>Birth Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<BirthReportingInfectionsPresent> getBirthReportingInfectionsPresents(BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection)
  {
    if (GET_BIRTH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(77));
      try
      {
        GET_BIRTH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY = helper.createQuery(GET_BIRTH_REPORTING_INFECTIONS_PRESENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BIRTH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<BirthReportingInfectionsPresent> result = (Collection<BirthReportingInfectionsPresent>) query.evaluate(birthReportingPrenatalExperienceSection);
    return new BasicEList.UnmodifiableEList<BirthReportingInfectionsPresent>(result.size(), result.toArray());
  }

} // BirthReportingPrenatalExperienceSectionOperations