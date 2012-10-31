/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.operations.RiskIndicatorsForHearingLossSectionOperations;

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
		return QrphPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION;
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
