/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PalpableMassOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palpable Mass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PalpableMassImpl extends ObservationImpl implements PalpableMass
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PalpableMassImpl()
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
    return SdtmPackage.Literals.PALPABLE_MASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePalpableMassMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PalpableMassOperations.validatePalpableMassMassIdentification(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return PalpableMassOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return PalpableMassOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return PalpableMassOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalpableMass init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PalpableMass init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PalpableMassImpl
