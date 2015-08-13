/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.ProcedureActivityActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityActImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureActivityActImpl implements ProcedureActivityAct
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureActivityActImpl()
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
    return HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHPOCProcedureActivityActText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateHPOCProcedureActivityActText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHPOCProcedureActivityActEntryRelationshipEncounter(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateHPOCProcedureActivityActEntryRelationshipEncounter(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHPOCProcedureActivityActEntryRelationshipInstructions(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateHPOCProcedureActivityActEntryRelationshipInstructions(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHPOCProcedureActivityActEntryRelationshipIndication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateHPOCProcedureActivityActEntryRelationshipIndication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHPOCProcedureActivityActEntryRelationshipMedication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateHPOCProcedureActivityActEntryRelationshipMedication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHPOCProcedureActivityActEntryRelationshipProcedure(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateHPOCProcedureActivityActEntryRelationshipProcedure(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateProcedureActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateProcedureActivityActTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateProcedureActivityActCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureActivityActOperations.validateProcedureActivityActCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureActivityAct init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureActivityAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ProcedureActivityActImpl
