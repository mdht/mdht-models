/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PlanOfCareSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Plan Of Care Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl
		implements PlanOfCareSection {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected PlanOfCareSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PlanOfCareSectionOperations.validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareActivityAct getmu2consolPlanOfCareActivityAct() {
    return PlanOfCareSectionOperations.getmu2consolPlanOfCareActivityAct(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareActivityEncounter getmu2consolPlanOfCareActivityEncounter() {
    return PlanOfCareSectionOperations.getmu2consolPlanOfCareActivityEncounter(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareActivityObservation getmu2consolPlanOfCareActivityObservation() {
    return PlanOfCareSectionOperations.getmu2consolPlanOfCareActivityObservation(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public PlanOfCareSection init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PlanOfCareSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PlanOfCareSectionImpl
