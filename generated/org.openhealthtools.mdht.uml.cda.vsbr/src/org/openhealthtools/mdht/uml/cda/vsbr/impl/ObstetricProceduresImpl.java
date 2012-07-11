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

import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.ObstetricProceduresOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstetric Procedures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ObstetricProceduresImpl extends ObservationImpl implements ObstetricProcedures
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObstetricProceduresImpl()
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
    return VsbrPackage.Literals.OBSTETRIC_PROCEDURES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProceduresTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ObstetricProceduresOperations.validateObstetricProceduresTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProceduresClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ObstetricProceduresOperations.validateObstetricProceduresClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProceduresCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ObstetricProceduresOperations.validateObstetricProceduresCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProceduresMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ObstetricProceduresOperations.validateObstetricProceduresMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObstetricProceduresValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ObstetricProceduresOperations.validateObstetricProceduresValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObstetricProcedures init() {
    	CDAUtil.init(this);
    	return this;
  }
} //ObstetricProceduresImpl
