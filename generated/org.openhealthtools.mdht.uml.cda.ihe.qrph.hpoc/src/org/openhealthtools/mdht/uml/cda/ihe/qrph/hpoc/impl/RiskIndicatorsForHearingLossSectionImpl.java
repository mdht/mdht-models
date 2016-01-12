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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.RiskIndicatorsForHearingLossSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Indicators For Hearing Loss Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RiskIndicatorsForHearingLossSectionImpl extends SectionImpl implements RiskIndicatorsForHearingLossSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RiskIndicatorsForHearingLossSectionImpl()
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
    return HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorsForHearingLossSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorsForHearingLossSectionOperations.validateRiskIndicatorsForHearingLossSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorsForHearingLossSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorsForHearingLossSectionOperations.validateRiskIndicatorsForHearingLossSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorsForHearingLossSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorsForHearingLossSectionOperations.validateRiskIndicatorsForHearingLossSectionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorsForHearingLossSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorsForHearingLossSectionOperations.validateRiskIndicatorsForHearingLossSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorsForHearingLossSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorsForHearingLossSectionOperations.validateRiskIndicatorsForHearingLossSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorsForHearingLossSectionEntry(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorsForHearingLossSectionOperations.validateRiskIndicatorsForHearingLossSectionEntry(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskIndicatorsForHearingLossSection init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskIndicatorsForHearingLossSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //RiskIndicatorsForHearingLossSectionImpl
