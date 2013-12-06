/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathLocationTypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeathLocationTypeImpl extends ObservationImpl implements DeathLocationType
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathLocationTypeImpl()
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
    return VsdrPackage.Literals.DEATH_LOCATION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathLocationTypeOperations.validateDeathLocationTypeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathLocationType init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeathLocationType init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DeathLocationTypeImpl
