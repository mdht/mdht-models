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

import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.BirthReportingInfectionsPresentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Birth Reporting Infections Present</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BirthReportingInfectionsPresentImpl extends ObservationImpl implements BirthReportingInfectionsPresent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BirthReportingInfectionsPresentImpl()
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
    return VsbrPackage.Literals.BIRTH_REPORTING_INFECTIONS_PRESENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingInfectionsPresentOperations.validateBirthReportingInfectionsPresentTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingInfectionsPresentOperations.validateBirthReportingInfectionsPresentClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresentCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingInfectionsPresentOperations.validateBirthReportingInfectionsPresentCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingInfectionsPresentOperations.validateBirthReportingInfectionsPresentMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBirthReportingInfectionsPresentValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BirthReportingInfectionsPresentOperations.validateBirthReportingInfectionsPresentValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthReportingInfectionsPresent init() {
    	CDAUtil.init(this);
    	return this;
  }
} //BirthReportingInfectionsPresentImpl
