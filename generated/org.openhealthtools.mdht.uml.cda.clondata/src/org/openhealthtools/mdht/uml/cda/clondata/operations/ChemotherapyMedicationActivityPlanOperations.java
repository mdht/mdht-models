/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chemotherapy Medication Activity Plan</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanClinicalDrugTrial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Clinical Drug Trial</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Chemotherapy Protocol Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validateChemotherapyMedicationActivityPlanMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#getClinicalDrugTrial() <em>Get Clinical Drug Trial</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#getChemotherapyProtocolReference() <em>Get Chemotherapy Protocol Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan#validatePlanOfCareActivitySubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChemotherapyMedicationActivityPlanOperations extends PlanOfCareActivitySubstanceAdministrationOperations {
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
	protected ChemotherapyMedicationActivityPlanOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanEffectiveTime(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanEffectiveTime(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanEffectiveTime(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanEffectiveTime(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanEffectiveTime(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanRepeatNumber(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanRepeatNumber(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanRepeatNumber(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanRepeatNumber(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanRepeatNumber(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanRepeatNumber",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanRouteCodeP(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanRouteCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanRouteCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanRouteCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C38192' or value.code = 'C38193' or value.code = 'C38194' or value.code = 'C38675' or value.code = 'C38197' or value.code = 'C38633' or value.code = 'C38205' or value.code = 'C38206' or value.code = 'C38208' or value.code = 'C38209' or value.code = 'C38210' or value.code = 'C38211' or value.code = 'C38212' or value.code = 'C38200' or value.code = 'C38215' or value.code = 'C38219' or value.code = 'C38220' or value.code = 'C38221' or value.code = 'C38222' or value.code = 'C38223' or value.code = 'C38224' or value.code = 'C38225' or value.code = 'C38226' or value.code = 'C38227' or value.code = 'C38228' or value.code = 'C38229' or value.code = 'C38230' or value.code = 'C38231' or value.code = 'C38232' or value.code = 'C38233' or value.code = 'C38234' or value.code = 'C38217' or value.code = 'C38218' or value.code = 'C38235' or value.code = 'C38238' or value.code = 'C38239' or value.code = 'C38240' or value.code = 'C38241' or value.code = 'C38242' or value.code = 'C38243' or value.code = 'C38245' or value.code = 'C38246' or value.code = 'C38247' or value.code = 'C38249' or value.code = 'C38250' or value.code = 'C38251' or value.code = 'C38252' or value.code = 'C38253' or value.code = 'C38254' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38256' or value.code = 'C38257' or value.code = 'C38258' or value.code = 'C38259' or value.code = 'C38260' or value.code = 'C38261' or value.code = 'C38262' or value.code = 'C38263' or value.code = 'C38264' or value.code = 'C38265' or value.code = 'C38266' or value.code = 'C38267' or value.code = 'C38207' or value.code = 'C38268' or value.code = 'C38269' or value.code = 'C38270' or value.code = 'C38272' or value.code = 'C38273' or value.code = 'C38276' or value.code = 'C38277' or value.code = 'C38278' or value.code = 'C38280' or value.code = 'C38203' or value.code = 'C38281' or value.code = 'C38282' or value.code = 'C38284' or value.code = 'C38285' or value.code = 'C48623' or value.code = 'C38286' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38289' or value.code = 'C38291' or value.code = 'C38676' or value.code = 'C38292' or value.code = 'C38677' or value.code = 'C38293' or value.code = 'C38294' or value.code = 'C38295' or value.code = 'C38216' or value.code = 'C38296' or value.code = 'C38198' or value.code = 'C38297' or value.code = 'C38298' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38301' or value.code = 'C38304' or value.code = 'C38305' or value.code = 'C38283' or value.code = 'C38307' or value.code = 'C38308' or value.code = 'C38309' or value.code = 'C38312' or value.code = 'C38271'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanRouteCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanRouteCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanRouteCodeP(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanRouteCodeP(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanRouteCodeP(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanRouteCodeP(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanRouteCode(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanRouteCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanStatusCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanStatusCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanStatusCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanStatusCode(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanStatusCode(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanClinicalDrugTrial(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Clinical Drug Trial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanClinicalDrugTrial(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ClinicalDrugTrial) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanClinicalDrugTrial(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Clinical Drug Trial</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanClinicalDrugTrial(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanClinicalDrugTrial(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanClinicalDrugTrial",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanReactionObservation(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanReactionObservation(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanReactionObservation(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanReactionObservation(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanReactionObservation(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanReactionObservation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Chemotherapy Protocol Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ChemotherapyProtocolReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Chemotherapy Protocol Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanChemotherapyProtocolReference",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityPlanMedicationActivity(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanMedicationActivity(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityPlanMedicationActivity(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Plan Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityPlanMedicationActivity(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityPlanMedicationActivity(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanChemotherapyMedicationActivityPlanMedicationActivity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getClinicalDrugTrial(ChemotherapyMedicationActivityPlan) <em>Get Clinical Drug Trial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalDrugTrial(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CLINICAL_DRUG_TRIAL__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ClinicalDrugTrial))->asSequence()->any(true).oclAsType(clondata::ClinicalDrugTrial)";

	/**
	 * The cached OCL query for the '{@link #getClinicalDrugTrial(ChemotherapyMedicationActivityPlan) <em>Get Clinical Drug Trial</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalDrugTrial(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CLINICAL_DRUG_TRIAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ClinicalDrugTrial getClinicalDrugTrial(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan) {

		if (GET_CLINICAL_DRUG_TRIAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan(),
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan().getEAllOperations().get(65));
			try {
				GET_CLINICAL_DRUG_TRIAL__EOCL_QRY = helper.createQuery(GET_CLINICAL_DRUG_TRIAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CLINICAL_DRUG_TRIAL__EOCL_QRY);
		return (ClinicalDrugTrial) query.evaluate(chemotherapyMedicationActivityPlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation(ChemotherapyMedicationActivityPlan) <em>Get Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation))->asSequence()->any(true).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation(ChemotherapyMedicationActivityPlan) <em>Get Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReactionObservation getReactionObservation(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan) {

		if (GET_REACTION_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan(),
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan().getEAllOperations().get(66));
			try {
				GET_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REACTION_OBSERVATION__EOCL_QRY);
		return (ReactionObservation) query.evaluate(chemotherapyMedicationActivityPlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan) <em>Get Chemotherapy Protocol Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEMOTHERAPY_PROTOCOL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ChemotherapyProtocolReference))->asSequence()->any(true).oclAsType(clondata::ChemotherapyProtocolReference)";

	/**
	 * The cached OCL query for the '{@link #getChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan) <em>Get Chemotherapy Protocol Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyProtocolReference(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEMOTHERAPY_PROTOCOL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChemotherapyProtocolReference getChemotherapyProtocolReference(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan) {

		if (GET_CHEMOTHERAPY_PROTOCOL_REFERENCE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan(),
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan().getEAllOperations().get(67));
			try {
				GET_CHEMOTHERAPY_PROTOCOL_REFERENCE__EOCL_QRY = helper.createQuery(
					GET_CHEMOTHERAPY_PROTOCOL_REFERENCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHEMOTHERAPY_PROTOCOL_REFERENCE__EOCL_QRY);
		return (ChemotherapyProtocolReference) query.evaluate(chemotherapyMedicationActivityPlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivity(ChemotherapyMedicationActivityPlan) <em>Get Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->any(true).oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivity(ChemotherapyMedicationActivityPlan) <em>Get Medication Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(ChemotherapyMedicationActivityPlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationActivity getMedicationActivity(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan) {

		if (GET_MEDICATION_ACTIVITY__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan(),
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan().getEAllOperations().get(68));
			try {
				GET_MEDICATION_ACTIVITY__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATION_ACTIVITY__EOCL_QRY);
		return (MedicationActivity) query.evaluate(chemotherapyMedicationActivityPlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySubstanceAdministrationTemplateId(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySubstanceAdministrationTemplateId(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.51')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySubstanceAdministrationTemplateId(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySubstanceAdministrationTemplateId(ChemotherapyMedicationActivityPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivityPlan The receiving '<em><b>Chemotherapy Medication Activity Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan());
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivityPlan)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityPlanPlanOfCareActivitySubstanceAdministrationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivityPlan, context) }),
						new Object[] { chemotherapyMedicationActivityPlan }));
			}

			return false;
		}
		return true;
	}

} // ChemotherapyMedicationActivityPlanOperations
