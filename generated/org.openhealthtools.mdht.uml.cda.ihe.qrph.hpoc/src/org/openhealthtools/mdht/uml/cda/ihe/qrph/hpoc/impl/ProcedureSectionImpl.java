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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.ProcedureSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureSectionImpl extends SectionImpl implements ProcedureSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureSectionImpl()
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
    return HPOCPackage.Literals.PROCEDURE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionEntryProcedureActivityProcedure(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionEntryProcedureActivityProcedure(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcedureSectionEntryProcedureActivityAct(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ProcedureSectionOperations.validateProcedureSectionEntryProcedureActivityAct(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureSection init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ProcedureSectionImpl
