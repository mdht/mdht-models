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

import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AttemptedVacuumExtractionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attempted Vacuum Extraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AttemptedVacuumExtractionImpl extends ObservationImpl implements AttemptedVacuumExtraction
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttemptedVacuumExtractionImpl()
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
    return VsbrPackage.Literals.ATTEMPTED_VACUUM_EXTRACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtractionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedVacuumExtractionOperations.validateAttemptedVacuumExtractionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtractionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedVacuumExtractionOperations.validateAttemptedVacuumExtractionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtractionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedVacuumExtractionOperations.validateAttemptedVacuumExtractionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtractionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedVacuumExtractionOperations.validateAttemptedVacuumExtractionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedVacuumExtractionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedVacuumExtractionOperations.validateAttemptedVacuumExtractionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttemptedVacuumExtraction init() {
    	CDAUtil.init(this);
    	return this;
  }
} //AttemptedVacuumExtractionImpl
