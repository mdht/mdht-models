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
import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.Height;
import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes;
import org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.BirthReportingPrenatalExperienceSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Birth Reporting Prenatal Experience Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BirthReportingPrenatalExperienceSectionImpl extends SectionImpl implements BirthReportingPrenatalExperienceSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BirthReportingPrenatalExperienceSectionImpl()
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
    return VsbrPackage.Literals.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionPreNatalCare(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionPreNatalCare(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionHeight(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionHeight(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionRiskFactor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionRiskFactor(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingPrenatalExperienceSectionOperations.validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreNatalCare getPreNatalCare()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getPreNatalCare(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Height getHeight()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getHeight(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateofLastLiveBirth getDateofLastLiveBirth()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getDateofLastLiveBirth(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastMenstrualPeriodDate getLastMenstrualPeriodDate()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getLastMenstrualPeriodDate(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofBirthsStillLiving getNumberofBirthsStillLiving()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getNumberofBirthsStillLiving(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofLiveBirthsnowDead getNumberofLiveBirthsnowDead()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getNumberofLiveBirthsnowDead(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherPregnancyOutcomes getOtherPreganancyOutcomes()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getOtherPreganancyOutcomes(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BirthReportingInfectionsPresent> getRiskFactors()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getRiskFactors(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BirthReportingInfectionsPresent> getBirthReportingInfectionsPresents()
  {
    return BirthReportingPrenatalExperienceSectionOperations.getBirthReportingInfectionsPresents(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthReportingPrenatalExperienceSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //BirthReportingPrenatalExperienceSectionImpl
