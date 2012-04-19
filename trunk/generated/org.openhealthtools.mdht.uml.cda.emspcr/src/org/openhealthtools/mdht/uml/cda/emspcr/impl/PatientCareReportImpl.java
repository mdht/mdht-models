/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientCareReportOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientCareReportImpl extends GeneralHeaderConstraintsImpl implements PatientCareReport
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatientCareReportImpl()
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
    return EmspcrPackage.Literals.PATIENT_CARE_REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportVersionNumber(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportHumanAuthor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportHumanAuthor(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportComponentOf(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportAllergiesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportAllergiesSectionEntriesOptional(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional()
  {
    return PatientCareReportOperations.getAdvanceDirectivesSectionEntriesOptional(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional()
  {
    return PatientCareReportOperations.getAllergiesSectionEntriesOptional(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSBilling getBilling()
  {
    return PatientCareReportOperations.getBilling(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSInjuryIncidentDescription getSection()
  {
    return PatientCareReportOperations.getSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientCareReport init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PatientCareReportImpl
