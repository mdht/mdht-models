/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getMu2consolPlanOfCareActivityActs() <em>Get Mu2consol Plan Of Care Activity Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getMu2consolPlanOfCareActivityEncounters() <em>Get Mu2consol Plan Of Care Activity Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getMu2consolPlanOfCareActivityObservations() <em>Get Mu2consol Plan Of Care Activity Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
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
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolPlanOfCareSectionCarePlanningForPlanOfCare"),
						 new Object [] { planOfCareSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))
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

	public static boolean validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.PLAN_OF_CARE_SECTION__MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolPlanOfCareSectionPlanOfCareActivityObservation"),
						 new Object [] { planOfCareSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMu2consolPlanOfCareActivityActs(PlanOfCareSection)
	 * <em>Get Mu2consol Plan Of Care Activity Acts</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMu2consolPlanOfCareActivityActs(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct)).oclAsType(consol::PlanOfCareActivityAct)";

	/**
	 * The cached OCL query for the '
	 * {@link #getMu2consolPlanOfCareActivityActs(PlanOfCareSection)
	 * <em>Get Mu2consol Plan Of Care Activity Acts</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMu2consolPlanOfCareActivityActs(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::PlanOfCareActivityAct)).oclAsType(consol::PlanOfCareActivityAct)
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityAct> getMu2consolPlanOfCareActivityActs(
			PlanOfCareSection planOfCareSection) {
		if (GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION, Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(76));
			try {
				GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityAct> result = (Collection<PlanOfCareActivityAct>) query.evaluate(planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMu2consolPlanOfCareActivityEncounters(PlanOfCareSection)
	 * <em>Get Mu2consol Plan Of Care Activity Encounters</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMu2consolPlanOfCareActivityEncounters(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter)).oclAsType(consol::PlanOfCareActivityEncounter)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolPlanOfCareActivityEncounters(PlanOfCareSection) <em>Get Mu2consol Plan Of Care Activity Encounters</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMu2consolPlanOfCareActivityEncounters(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not
	 * encounter.oclIsUndefined() and
	 * encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter
	 * )).oclAsType(consol::PlanOfCareActivityEncounter)
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityEncounter> getMu2consolPlanOfCareActivityEncounters(
			PlanOfCareSection planOfCareSection) {
		if (GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION, Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(77));
			try {
				GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityEncounter> result = (Collection<PlanOfCareActivityEncounter>) query.evaluate(planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityEncounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolPlanOfCareActivityObservations(PlanOfCareSection) <em>Get Mu2consol Plan Of Care Activity Observations</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMu2consolPlanOfCareActivityObservations(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation)).oclAsType(consol::PlanOfCareActivityObservation)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolPlanOfCareActivityObservations(PlanOfCareSection) <em>Get Mu2consol Plan Of Care Activity Observations</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMu2consolPlanOfCareActivityObservations(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::PlanOfCareActivityObservation
	 * )).oclAsType(consol::PlanOfCareActivityObservation)
	 * 
	 * @param planOfCareSection
	 *            The receiving '<em><b>Plan Of Care Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityObservation> getMu2consolPlanOfCareActivityObservations(
			PlanOfCareSection planOfCareSection) {
		if (GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION, Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(78));
			try {
				GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityObservation> result = (Collection<PlanOfCareActivityObservation>) query.evaluate(planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Plan Of Care Section Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfCareSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.10')
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

	public static boolean validatePlanOfCareSectionTemplateId(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlanOfCareSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(planOfCareSection, context) }),
						 new Object [] { planOfCareSection }));
			}
			 
			return false;
		}
		return true;
	}

} // PlanOfCareSectionOperations