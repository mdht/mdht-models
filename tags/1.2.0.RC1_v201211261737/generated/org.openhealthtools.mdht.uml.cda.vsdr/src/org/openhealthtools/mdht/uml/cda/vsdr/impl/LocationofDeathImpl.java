/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.LocationofDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locationof Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocationofDeathImpl extends ObservationImpl implements LocationofDeath
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationofDeathImpl()
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
    return VsdrPackage.Literals.LOCATIONOF_DEATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeathValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationofDeathOperations.validateLocationofDeathValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationofDeath init() {
    	CDAUtil.init(this);
    	return this;
  }
} //LocationofDeathImpl
