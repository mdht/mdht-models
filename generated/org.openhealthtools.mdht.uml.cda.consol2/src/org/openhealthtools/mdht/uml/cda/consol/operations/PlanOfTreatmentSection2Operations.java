/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Treatment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2HandoffCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2NutritionRecommendation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2GoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedObservation2s() <em>Get Consol Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedEncounter2s() <em>Get Consol Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedAct2s() <em>Get Consol Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedProcedure2s() <em>Get Consol Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedMedicationActivity2s() <em>Get Consol Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedSupply2s() <em>Get Consol Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolInstruction2s() <em>Get Consol Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getHandoffCommunications() <em>Get Handoff Communications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getNutritionRecommendations() <em>Get Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getPlannedImmunizationActivities() <em>Get Planned Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivitySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfTreatmentSection2Operations extends PlanOfCareSectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfTreatmentSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2TemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2TemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2TemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2TemplateId(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2TemplateId(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfTreatmentSection2TemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2TemplateId"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HandoffCommunicationParticipants))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2HandoffCommunication(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2HandoffCommunication(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfTreatmentSection2HandoffCommunication","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2HandoffCommunication"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2NutritionRecommendation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2NutritionRecommendation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::NutritionRecommendation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2NutritionRecommendation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2NutritionRecommendation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2NutritionRecommendation(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfTreatmentSection2NutritionRecommendation","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2NutritionRecommendation"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2PlannedImmunizationActivity(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedImmunizationActivity(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2PlannedImmunizationActivity(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2PlannedImmunizationActivity(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2PlannedImmunizationActivity(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedImmunizationActivity","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2PlannedImmunizationActivity"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfTreatmentSection2GoalObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2GoalObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::GoalObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfTreatmentSection2GoalObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfTreatmentSection2GoalObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfTreatmentSection2GoalObservation(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfTreatmentSection2GoalObservation","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfTreatmentSection2GoalObservation"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedObservation2s(PlanOfTreatmentSection2) <em>Get Consol Planned Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedObservation2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)).oclAsType(consol::PlannedObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedObservation2s(PlanOfTreatmentSection2) <em>Get Consol Planned Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedObservation2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedObservation2> getConsolPlannedObservation2s(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(79));
			try {
				GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedObservation2> result = (Collection<PlannedObservation2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedEncounter2s(PlanOfTreatmentSection2) <em>Get Consol Planned Encounter2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedEncounter2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)).oclAsType(consol::PlannedEncounter2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedEncounter2s(PlanOfTreatmentSection2) <em>Get Consol Planned Encounter2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedEncounter2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedEncounter2> getConsolPlannedEncounter2s(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(80));
			try {
				GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_ENCOUNTER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedEncounter2> result = (Collection<PlannedEncounter2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedEncounter2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedAct2s(PlanOfTreatmentSection2) <em>Get Consol Planned Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedAct2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)).oclAsType(consol::PlannedAct2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedAct2s(PlanOfTreatmentSection2) <em>Get Consol Planned Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedAct2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedAct2> getConsolPlannedAct2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_PLANNED_ACT2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(81));
			try {
				GET_CONSOL_PLANNED_ACT2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_ACT2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedAct2> result = (Collection<PlannedAct2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedProcedure2s(PlanOfTreatmentSection2) <em>Get Consol Planned Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedProcedure2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)).oclAsType(consol::PlannedProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedProcedure2s(PlanOfTreatmentSection2) <em>Get Consol Planned Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedProcedure2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedProcedure2> getConsolPlannedProcedure2s(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(82));
			try {
				GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedProcedure2> result = (Collection<PlannedProcedure2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedProcedure2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2) <em>Get Consol Planned Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)).oclAsType(consol::PlannedMedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2) <em>Get Consol Planned Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedMedicationActivity2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedMedicationActivity2> getConsolPlannedMedicationActivity2s(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(83));
			try {
				GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedMedicationActivity2> result = (Collection<PlannedMedicationActivity2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedMedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedSupply2s(PlanOfTreatmentSection2) <em>Get Consol Planned Supply2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedSupply2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_SUPPLY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)).oclAsType(consol::PlannedSupply2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedSupply2s(PlanOfTreatmentSection2) <em>Get Consol Planned Supply2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedSupply2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedSupply2> getConsolPlannedSupply2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(84));
			try {
				GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_SUPPLY2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_SUPPLY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedSupply2> result = (Collection<PlannedSupply2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedSupply2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolInstruction2s(PlanOfTreatmentSection2) <em>Get Consol Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstruction2s(PlanOfTreatmentSection2) <em>Get Consol Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2s(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getConsolInstruction2s(PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_CONSOL_INSTRUCTION2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(85));
			try {
				GET_CONSOL_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTION2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHandoffCommunications(PlanOfTreatmentSection2) <em>Get Handoff Communications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunications(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HANDOFF_COMMUNICATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)).oclAsType(consol::HandoffCommunicationParticipants)";

	/**
	 * The cached OCL query for the '{@link #getHandoffCommunications(PlanOfTreatmentSection2) <em>Get Handoff Communications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunications(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HANDOFF_COMMUNICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HandoffCommunicationParticipants> getHandoffCommunications(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_HANDOFF_COMMUNICATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(86));
			try {
				GET_HANDOFF_COMMUNICATIONS__EOCL_QRY = helper.createQuery(GET_HANDOFF_COMMUNICATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HANDOFF_COMMUNICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HandoffCommunicationParticipants> result = (Collection<HandoffCommunicationParticipants>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<HandoffCommunicationParticipants>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionRecommendations(PlanOfTreatmentSection2) <em>Get Nutrition Recommendations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendations(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_RECOMMENDATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NutritionRecommendation)).oclAsType(consol::NutritionRecommendation)";

	/**
	 * The cached OCL query for the '{@link #getNutritionRecommendations(PlanOfTreatmentSection2) <em>Get Nutrition Recommendations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionRecommendations(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionRecommendation> getNutritionRecommendations(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(87));
			try {
				GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY = helper.createQuery(GET_NUTRITION_RECOMMENDATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUTRITION_RECOMMENDATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionRecommendation> result = (Collection<NutritionRecommendation>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<NutritionRecommendation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedImmunizationActivities(PlanOfTreatmentSection2) <em>Get Planned Immunization Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedImmunizationActivities(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedImmunizationActivity)).oclAsType(consol::PlannedImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getPlannedImmunizationActivities(PlanOfTreatmentSection2) <em>Get Planned Immunization Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedImmunizationActivities(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedImmunizationActivity> getPlannedImmunizationActivities(
			PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(88));
			try {
				GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANNED_IMMUNIZATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedImmunizationActivity> result = (Collection<PlannedImmunizationActivity>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<PlannedImmunizationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getGoalObservations(PlanOfTreatmentSection2) <em>Get Goal Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalObservations(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GOAL_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)).oclAsType(consol::GoalObservation)";

	/**
	 * The cached OCL query for the '{@link #getGoalObservations(PlanOfTreatmentSection2) <em>Get Goal Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalObservations(PlanOfTreatmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GOAL_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<GoalObservation> getGoalObservations(PlanOfTreatmentSection2 planOfTreatmentSection2) {
	
	
	
		if (GET_GOAL_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2, ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2.getEAllOperations().get(89));
			try {
				GET_GOAL_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_GOAL_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_GOAL_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<GoalObservation> result = (Collection<GoalObservation>) query.evaluate(planOfTreatmentSection2);
		return new BasicEList.UnmodifiableEList<GoalObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCodeP(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionCodeP"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP", passToken);
				}
				passToken.add(planOfTreatmentSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCode(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(planOfTreatmentSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionCode"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlannedObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityObservation(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityObservation","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityObservation"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::PlannedEncounter2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityEncounter(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityEncounter","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityEncounter"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlannedAct2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityAct(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityAct","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityAct"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlannedProcedure2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityProcedure(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityProcedure","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivityProcedure"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivitySubstanceAdministration","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivitySubstanceAdministration"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::PlannedSupply2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivitySupply(
			PlanOfTreatmentSection2 planOfTreatmentSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivitySupply","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionPlanOfCareActivitySupply"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionInstructions(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionInstructions(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instruction2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionInstructions(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionInstructions(PlanOfTreatmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfTreatmentSection2 The receiving '<em><b>Plan Of Treatment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionInstructions(PlanOfTreatmentSection2 planOfTreatmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlanOfTreatmentSection2PlanOfCareSectionInstructions","INFO");
    
  	  
  	  
		if (VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfTreatmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLAN_OF_TREATMENT_SECTION2__PLAN_OF_CARE_SECTION_INSTRUCTIONS,
						 ConsolPlugin.INSTANCE.getString("PlanOfTreatmentSection2PlanOfCareSectionInstructions"),
						 new Object [] { planOfTreatmentSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // PlanOfTreatmentSection2Operations
