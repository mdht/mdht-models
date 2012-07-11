/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeathReportingInfectionsPresentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetal Death Reporting Infections Present</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FetalDeathReportingInfectionsPresentImpl extends ObservationImpl implements FetalDeathReportingInfectionsPresent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetalDeathReportingInfectionsPresentImpl()
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
    return VsbrPackage.Literals.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingInfectionsPresentOperations.validateFetalDeathReportingInfectionsPresentTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingInfectionsPresentOperations.validateFetalDeathReportingInfectionsPresentClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresentCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingInfectionsPresentOperations.validateFetalDeathReportingInfectionsPresentCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingInfectionsPresentOperations.validateFetalDeathReportingInfectionsPresentMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeathReportingInfectionsPresentValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeathReportingInfectionsPresentOperations.validateFetalDeathReportingInfectionsPresentValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalDeathReportingInfectionsPresent init() {
    	CDAUtil.init(this);
    	return this;
  }
} //FetalDeathReportingInfectionsPresentImpl
