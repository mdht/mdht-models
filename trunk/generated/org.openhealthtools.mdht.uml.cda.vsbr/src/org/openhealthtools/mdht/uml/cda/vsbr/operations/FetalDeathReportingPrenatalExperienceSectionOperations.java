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
import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection;
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
 * A static utility class that provides operations related to '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Fetal Death Reporting Infections Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getPreNatalCare() <em>Get Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getHeight() <em>Get Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getDateofLastLiveBirth() <em>Get Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getLastMenstrualPeriodDate() <em>Get Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getNumberofBirthsStillLiving() <em>Get Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getNumberofLiveBirthsnowDead() <em>Get Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getOtherPreganancyOutcomes() <em>Get Other Preganancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getRiskFactors() <em>Get Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection#getFetalDeathReportingInfectionsPresents() <em>Get Fetal Death Reporting Infections Presents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetalDeathReportingPrenatalExperienceSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetalDeathReportingPrenatalExperienceSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionTemplateId(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionTemplateId(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.4')";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionTemplateId(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionTemplateId(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.4')
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionTemplateId(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionClassCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionClassCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionClassCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionClassCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::DOCSECT
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionClassCode(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionCode(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionMoodCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionMoodCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionMoodCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionMoodCode(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionMoodCode(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionText(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionText(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionText(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionText(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionText(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Pre Natal Care</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Pre-Natal Care) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Pre Natal Care</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Pre-Natal Care) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_PRE_NATAL_CARE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionPreNatalCare", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionHeight(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Height</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionHeight(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Height) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionHeight(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Height</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionHeight(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Height) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionHeight(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_HEIGHT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionHeight", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Dateof Last Live Birth</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Date of Last Live Birth) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Dateof Last Live Birth</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Date of Last Live Birth) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_DATEOF_LAST_LIVE_BIRTH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Births Still Living</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Births Still Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Births Still Living</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Births Still Living) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_BIRTHS_STILL_LIVING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Live Births now Dead) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Numberof Live Birthsnow Dead</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Live Births now Dead) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Other Preganancy Outcomes</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_OTHER_PREGANANCY_OUTCOMES,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Risk Factor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Risk Factor</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_RISK_FACTOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionRiskFactor", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Fetal Death Reporting Infections Present</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Fetal Death Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Reporting Prenatal Experience Section Fetal Death Reporting Infections Present</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(FetalDeathReportingPrenatalExperienceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Fetal Death Reporting - Infections Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);
      try
      {
        VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalDeathReportingPrenatalExperienceSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION__FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION_FETAL_DEATH_REPORTING_INFECTIONS_PRESENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeathReportingPrenatalExperienceSection, context) }),
             new Object [] { fetalDeathReportingPrenatalExperienceSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getPreNatalCare(FetalDeathReportingPrenatalExperienceSection) <em>Get Pre Natal Care</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreNatalCare(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_NATAL_CARE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Pre-Natal Care))->asSequence()->any(true).oclAsType(vsbr::Pre-Natal Care)";

  /**
   * The cached OCL query for the '{@link #getPreNatalCare(FetalDeathReportingPrenatalExperienceSection) <em>Get Pre Natal Care</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreNatalCare(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_NATAL_CARE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Pre-Natal Care))->asSequence()->any(true).oclAsType(vsbr::Pre-Natal Care)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  PreNatalCare getPreNatalCare(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_PRE_NATAL_CARE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(68));
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
    return (PreNatalCare) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getHeight(FetalDeathReportingPrenatalExperienceSection) <em>Get Height</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_HEIGHT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Height))->asSequence()->any(true).oclAsType(vsbr::Height)";

  /**
   * The cached OCL query for the '{@link #getHeight(FetalDeathReportingPrenatalExperienceSection) <em>Get Height</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HEIGHT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Height))->asSequence()->any(true).oclAsType(vsbr::Height)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Height getHeight(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_HEIGHT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(69));
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
    return (Height) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection) <em>Get Dateof Last Live Birth</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_DATEOF_LAST_LIVE_BIRTH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Date of Last Live Birth))->asSequence()->any(true).oclAsType(vsbr::Date of Last Live Birth)";

  /**
   * The cached OCL query for the '{@link #getDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection) <em>Get Dateof Last Live Birth</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Date of Last Live Birth))->asSequence()->any(true).oclAsType(vsbr::Date of Last Live Birth)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DateofLastLiveBirth getDateofLastLiveBirth(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_DATEOF_LAST_LIVE_BIRTH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(70));
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
    return (DateofLastLiveBirth) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getLastMenstrualPeriodDate(FetalDeathReportingPrenatalExperienceSection) <em>Get Last Menstrual Period Date</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastMenstrualPeriodDate(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Last Menstrual Period Date))->asSequence()->any(true).oclAsType(vsbr::Last Menstrual Period Date)";

  /**
   * The cached OCL query for the '{@link #getLastMenstrualPeriodDate(FetalDeathReportingPrenatalExperienceSection) <em>Get Last Menstrual Period Date</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastMenstrualPeriodDate(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Last Menstrual Period Date))->asSequence()->any(true).oclAsType(vsbr::Last Menstrual Period Date)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  LastMenstrualPeriodDate getLastMenstrualPeriodDate(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_LAST_MENSTRUAL_PERIOD_DATE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(71));
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
    return (LastMenstrualPeriodDate) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection) <em>Get Numberof Births Still Living</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Births Still Living))->asSequence()->any(true).oclAsType(vsbr::Number of Births Still Living)";

  /**
   * The cached OCL query for the '{@link #getNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection) <em>Get Numberof Births Still Living</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Births Still Living))->asSequence()->any(true).oclAsType(vsbr::Number of Births Still Living)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NumberofBirthsStillLiving getNumberofBirthsStillLiving(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_NUMBEROF_BIRTHS_STILL_LIVING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(72));
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
    return (NumberofBirthsStillLiving) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection) <em>Get Numberof Live Birthsnow Dead</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Live Births now Dead))->asSequence()->any(true).oclAsType(vsbr::Number of Live Births now Dead)";

  /**
   * The cached OCL query for the '{@link #getNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection) <em>Get Numberof Live Birthsnow Dead</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Live Births now Dead))->asSequence()->any(true).oclAsType(vsbr::Number of Live Births now Dead)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NumberofLiveBirthsnowDead getNumberofLiveBirthsnowDead(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_NUMBEROF_LIVE_BIRTHSNOW_DEAD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(73));
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
    return (NumberofLiveBirthsnowDead) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection) <em>Get Other Preganancy Outcomes</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_OTHER_PREGANANCY_OUTCOMES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes))->asSequence()->any(true).oclAsType(vsbr::Other Pregnancy Outcomes)";

  /**
   * The cached OCL query for the '{@link #getOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection) <em>Get Other Preganancy Outcomes</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_OTHER_PREGANANCY_OUTCOMES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Other Pregnancy Outcomes))->asSequence()->any(true).oclAsType(vsbr::Other Pregnancy Outcomes)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  OtherPregnancyOutcomes getOtherPreganancyOutcomes(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_OTHER_PREGANANCY_OUTCOMES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(74));
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
    return (OtherPregnancyOutcomes) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getRiskFactors(FetalDeathReportingPrenatalExperienceSection) <em>Get Risk Factors</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskFactors(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_RISK_FACTORS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present)).oclAsType(vsbr::Birth Reporting - Infections Present)";

  /**
   * The cached OCL query for the '{@link #getRiskFactors(FetalDeathReportingPrenatalExperienceSection) <em>Get Risk Factors</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskFactors(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_RISK_FACTORS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Reporting - Infections Present)).oclAsType(vsbr::Birth Reporting - Infections Present)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<BirthReportingInfectionsPresent> getRiskFactors(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_RISK_FACTORS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(75));
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
    Collection<BirthReportingInfectionsPresent> result = (Collection<BirthReportingInfectionsPresent>) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
    return new BasicEList.UnmodifiableEList<BirthReportingInfectionsPresent>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getFetalDeathReportingInfectionsPresents(FetalDeathReportingPrenatalExperienceSection) <em>Get Fetal Death Reporting Infections Presents</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetalDeathReportingInfectionsPresents(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static final String GET_FETAL_DEATH_REPORTING_INFECTIONS_PRESENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Fetal Death Reporting - Infections Present)).oclAsType(vsbr::Fetal Death Reporting - Infections Present)";

  /**
   * The cached OCL query for the '{@link #getFetalDeathReportingInfectionsPresents(FetalDeathReportingPrenatalExperienceSection) <em>Get Fetal Death Reporting Infections Presents</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetalDeathReportingInfectionsPresents(FetalDeathReportingPrenatalExperienceSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_FETAL_DEATH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Fetal Death Reporting - Infections Present)).oclAsType(vsbr::Fetal Death Reporting - Infections Present)
   * @param fetalDeathReportingPrenatalExperienceSection The receiving '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<FetalDeathReportingInfectionsPresent> getFetalDeathReportingInfectionsPresents(FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection)
  {
    if (GET_FETAL_DEATH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION, VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION.getEAllOperations().get(76));
      try
      {
        GET_FETAL_DEATH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY = helper.createQuery(GET_FETAL_DEATH_REPORTING_INFECTIONS_PRESENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FETAL_DEATH_REPORTING_INFECTIONS_PRESENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<FetalDeathReportingInfectionsPresent> result = (Collection<FetalDeathReportingInfectionsPresent>) query.evaluate(fetalDeathReportingPrenatalExperienceSection);
    return new BasicEList.UnmodifiableEList<FetalDeathReportingInfectionsPresent>(result.size(), result.toArray());
  }

} // FetalDeathReportingPrenatalExperienceSectionOperations