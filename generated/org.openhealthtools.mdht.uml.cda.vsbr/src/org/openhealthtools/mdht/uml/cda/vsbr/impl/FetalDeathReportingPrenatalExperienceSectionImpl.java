/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeathReportingPrenatalExperienceSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetal Death Reporting Prenatal Experience Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FetalDeathReportingPrenatalExperienceSectionImpl extends SectionImpl implements FetalDeathReportingPrenatalExperienceSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetalDeathReportingPrenatalExperienceSectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VsbrPackage.Literals.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionHeight(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionHeight(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionRiskFactor(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreNatalCare getPreNatalCare()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getPreNatalCare(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Height getHeight()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getHeight(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateofLastLiveBirth getDateofLastLiveBirth()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getDateofLastLiveBirth(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastMenstrualPeriodDate getLastMenstrualPeriodDate()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getLastMenstrualPeriodDate(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofBirthsStillLiving getNumberofBirthsStillLiving()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getNumberofBirthsStillLiving(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofLiveBirthsnowDead getNumberofLiveBirthsnowDead()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getNumberofLiveBirthsnowDead(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherPregnancyOutcomes getOtherPreganancyOutcomes()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getOtherPreganancyOutcomes(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BirthReportingInfectionsPresent> getRiskFactors()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getRiskFactors(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FetalDeathReportingInfectionsPresent> getFetalDeathReportingInfectionsPresents()
  {
    return FetalDeathReportingPrenatalExperienceSectionOperations.getFetalDeathReportingInfectionsPresents(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalDeathReportingPrenatalExperienceSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //FetalDeathReportingPrenatalExperienceSectionImpl
