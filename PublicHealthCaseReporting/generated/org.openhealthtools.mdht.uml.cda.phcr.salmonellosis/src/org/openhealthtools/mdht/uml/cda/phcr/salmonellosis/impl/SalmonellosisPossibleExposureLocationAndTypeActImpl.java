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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPossibleExposureLocationAndTypeActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Exposure Location And Type Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPossibleExposureLocationAndTypeActImpl extends ActImpl implements SalmonellosisPossibleExposureLocationAndTypeAct
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisPossibleExposureLocationAndTypeActImpl()
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
    return SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(this, diagnostics, context);
  }
} //SalmonellosisPossibleExposureLocationAndTypeActImpl
