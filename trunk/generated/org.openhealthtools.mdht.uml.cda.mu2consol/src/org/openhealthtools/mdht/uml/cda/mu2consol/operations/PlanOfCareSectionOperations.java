/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Plan Of Care Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getmu2consolPlanOfCareActivityAct() <em>Getmu2consol Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getmu2consolPlanOfCareActivityEncounter() <em>Getmu2consol Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getmu2consolPlanOfCareActivityObservation() <em>Getmu2consol Plan Of Care Activity Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or self.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or self.getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::PlanOfCareActivityAct)) or
	 * self.getObservations()->exists(o : cda::Observation |
	 * o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or
	 * self.getEncounters()->exists(e : cda::Encounter |
	 * e.oclIsKindOf(consol::PlanOfCareActivityEncounter))
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Mu2consolPlanOfCareSectionCarePlanningForPlanOfCare", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(planOfCareSection, context) }),
						 new Object [] { planOfCareSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolPlanOfCareActivityAct(PlanOfCareSection)
	 * <em>Getmu2consol Plan Of Care Activity Act</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolPlanOfCareActivityAct(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityAct)";

	/**
	 * The cached OCL query for the '
	 * {@link #getmu2consolPlanOfCareActivityAct(PlanOfCareSection)
	 * <em>Getmu2consol Plan Of Care Activity Act</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolPlanOfCareActivityAct(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::PlanOfCareActivityAct))->asSequence()->any(true).oclAsType
	 * (consol::PlanOfCareActivityAct)
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivityAct getmu2consolPlanOfCareActivityAct(
			PlanOfCareSection planOfCareSection) {
		if (GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION, Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(75));
			try {
				GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY = helper.createQuery(GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY);
		return (PlanOfCareActivityAct) query.evaluate(planOfCareSection);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolPlanOfCareActivityEncounter(PlanOfCareSection)
	 * <em>Getmu2consol Plan Of Care Activity Encounter</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolPlanOfCareActivityEncounter(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityEncounter)";

	/**
	 * The cached OCL query for the '{@link #getmu2consolPlanOfCareActivityEncounter(PlanOfCareSection) <em>Getmu2consol Plan Of Care Activity Encounter</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getmu2consolPlanOfCareActivityEncounter(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not
	 * encounter.oclIsUndefined() and
	 * encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PlanOfCareActivityEncounter)
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivityEncounter getmu2consolPlanOfCareActivityEncounter(
			PlanOfCareSection planOfCareSection) {
		if (GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION, Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(76));
			try {
				GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY = helper.createQuery(GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY);
		return (PlanOfCareActivityEncounter) query.evaluate(planOfCareSection);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolPlanOfCareActivityObservation(PlanOfCareSection)
	 * <em>Getmu2consol Plan Of Care Activity Observation</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolPlanOfCareActivityObservation(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityObservation)";

	/**
	 * The cached OCL query for the '{@link #getmu2consolPlanOfCareActivityObservation(PlanOfCareSection) <em>Getmu2consol Plan Of Care Activity Observation</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getmu2consolPlanOfCareActivityObservation(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::PlanOfCareActivityObservation
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::PlanOfCareActivityObservation)
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivityObservation getmu2consolPlanOfCareActivityObservation(
			PlanOfCareSection planOfCareSection) {
		if (GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION, Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(77));
			try {
				GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY = helper.createQuery(GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY);
		return (PlanOfCareActivityObservation) query.evaluate(planOfCareSection);
	}

} // PlanOfCareSectionOperations