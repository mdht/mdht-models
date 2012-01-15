/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.consoltoc;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.consoltocOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>consoltoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class consoltocImpl extends GeneralHeaderConstraintsImpl implements consoltoc
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected consoltocImpl()
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
    return ConsoltocPackage.Literals.CONSOLTOC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return consoltocOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public consoltoc init() {
    	CDAUtil.init(this);
    	return this;
  }
} //consoltocImpl
