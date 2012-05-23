/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalLaboratoryTestResultOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HumanClinicalLaboratoryTestResultImpl extends ObservationImpl implements HumanClinicalLaboratoryTestResult
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalLaboratoryTestResultImpl()
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
    return SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalLaboratoryTestResult init() {
    	CDAUtil.init(this);
    	return this;
  }
} //HumanClinicalLaboratoryTestResultImpl
