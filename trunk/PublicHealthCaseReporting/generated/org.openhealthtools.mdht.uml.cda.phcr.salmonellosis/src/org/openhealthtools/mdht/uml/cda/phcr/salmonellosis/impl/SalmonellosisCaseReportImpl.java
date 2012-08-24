/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisCaseReportImpl extends PublicHealthCaseReportImpl implements SalmonellosisCaseReport
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisCaseReportImpl()
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
    return SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRSocialHistorySection getSalmonellosisSocialHistorySection()
  {
    return SalmonellosisCaseReportOperations.getSalmonellosisSocialHistorySection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRRelevantDxTestsSection getSalmonellosisRelevantDxTestsSection()
  {
    return SalmonellosisCaseReportOperations.getSalmonellosisRelevantDxTestsSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRClinicalInformationSection getSalmonellosisPHCRClinicalInformationSection()
  {
    return SalmonellosisCaseReportOperations.getSalmonellosisPHCRClinicalInformationSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisCaseReport init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SalmonellosisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SalmonellosisCaseReportImpl
