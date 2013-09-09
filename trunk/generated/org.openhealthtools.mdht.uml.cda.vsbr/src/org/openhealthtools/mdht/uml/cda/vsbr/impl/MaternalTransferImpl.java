/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MaternalTransferOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maternal Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaternalTransferImpl extends ObservationImpl implements MaternalTransfer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaternalTransferImpl()
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
    return VsbrPackage.Literals.MATERNAL_TRANSFER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalTransferParticipant(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalTransferOperations.validateMaternalTransferParticipant(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaternalTransfer init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaternalTransfer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MaternalTransferImpl
