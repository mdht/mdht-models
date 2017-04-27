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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareProcedureActivityActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Procedure Activity Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingPlanOfCareProcedureActivityActImpl extends EObjectImpl implements HearingPlanOfCareProcedureActivityAct
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingPlanOfCareProcedureActivityActImpl()
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
		return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROCEDURE_ACTIVITY_ACT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareProcedureActivityActText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProcedureActivityActOperations.validateHearingPlanOfCareProcedureActivityActText(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingPlanOfCareProcedureActivityAct init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareProcedureActivityAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProcedureActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProcedureActivityActOperations.validateProcedureActivityActTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProcedureActivityActId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProcedureActivityActOperations.validateProcedureActivityActId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProcedureActivityActCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareProcedureActivityActOperations.validateProcedureActivityActCode(this, diagnostics, context);
	}
} //HearingPlanOfCareProcedureActivityActImpl
