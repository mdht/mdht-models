/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemConcern;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareProblemConcernOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Problem Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingPlanOfCareProblemConcernImpl extends EObjectImpl implements HearingPlanOfCareProblemConcern
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingPlanOfCareProblemConcernImpl()
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
		return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEM_CONCERN;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProblemConcernText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProblemConcernOperations.validateHearingPlanOfCareProblemConcernText(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProblemConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProblemConcernOperations.validateProblemConcernActTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProblemConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProblemConcernOperations.validateProblemConcernActId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProblemConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProblemConcernOperations.validateProblemConcernActEffectiveTime(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingPlanOfCareProblemConcern init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareProblemConcern init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareProblemConcernImpl
