/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Obsevation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Author(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalObsevationV2Operations extends ClinicalStatementOperations {

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
	protected GoalObsevationV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2TemplateId(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2TemplateId(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.121' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2TemplateId(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2TemplateId(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2TemplateId(GoalObsevationV2 goalObsevationV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2TemplateId", "ERROR");

		if (VALIDATE_GOAL_OBSEVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GOAL_OBSEVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2TemplateId"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2Id(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Id(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2Id(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Id(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2Id(GoalObsevationV2 goalObsevationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2Id", "ERROR");

		if (VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_ID,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2Id"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2Code(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Code(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2Code(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Code(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2Code(GoalObsevationV2 goalObsevationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2Code", "ERROR");

		if (VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_CODE,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2Code"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2StatusCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2StatusCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2StatusCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2StatusCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2StatusCode(GoalObsevationV2 goalObsevationV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2StatusCode", "ERROR");

		if (VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2StatusCode"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2Value(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Value(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2Value(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Value(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2Value(GoalObsevationV2 goalObsevationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2Value", "INFO");

		if (VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_VALUE,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2Value"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2ClassCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2ClassCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2ClassCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2ClassCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2ClassCode(GoalObsevationV2 goalObsevationV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2ClassCode", "ERROR");

		if (VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2ClassCode"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2MoodCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2MoodCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2MoodCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2MoodCode(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2MoodCode(GoalObsevationV2 goalObsevationV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2MoodCode", "ERROR");

		if (VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2MoodCode"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObsevationV2Author(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Author(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObsevationV2Author(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObsevationV2Author(GoalObsevationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObsevationV2 The receiving '<em><b>Goal Obsevation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObsevationV2Author(GoalObsevationV2 goalObsevationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GoalObsevationV2GoalObsevationV2Author", "WARNING");

		if (VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSEVATION_V2);
			try {
				VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			goalObsevationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSEVATION_V2__GOAL_OBSEVATION_V2_AUTHOR,
						ConsolPlugin.INSTANCE.getString("GoalObsevationV2GoalObsevationV2Author"),
						new Object[] { goalObsevationV2 }));
			}

			return false;
		}
		return true;
	}

} // GoalObsevationV2Operations
