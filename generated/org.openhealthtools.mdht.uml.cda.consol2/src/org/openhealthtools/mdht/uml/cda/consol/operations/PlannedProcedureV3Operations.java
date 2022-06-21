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
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedProcedureV3Operations extends ClinicalStatementOperations {

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
	protected PlannedProcedureV3Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureV3Id(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3Id(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureV3Id(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3Id(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedureV3 The receiving '<em><b>Planned Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedureV3Id(PlannedProcedureV3 plannedProcedureV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedProcedureV3PlannedProcedureV3Id", "ERROR");

		if (VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_V3);
			try {
				VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_PROCEDURE_V3__PLANNED_PROCEDURE_V3_ID,
						ConsolPlugin.INSTANCE.getString("PlannedProcedureV3PlannedProcedureV3Id"),
						new Object[] { plannedProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureV3Code(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3Code(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureV3Code(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3Code(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedureV3 The receiving '<em><b>Planned Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedureV3Code(PlannedProcedureV3 plannedProcedureV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedProcedureV3PlannedProcedureV3Code", "ERROR");

		if (VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_V3);
			try {
				VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_PROCEDURE_V3__PLANNED_PROCEDURE_V3_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedProcedureV3PlannedProcedureV3Code"),
						new Object[] { plannedProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureV3StatusCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3StatusCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureV3StatusCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3StatusCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedureV3 The receiving '<em><b>Planned Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedureV3StatusCode(PlannedProcedureV3 plannedProcedureV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedProcedureV3PlannedProcedureV3StatusCode", "ERROR");

		if (VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_V3);
			try {
				VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_PROCEDURE_V3__PLANNED_PROCEDURE_V3_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedProcedureV3PlannedProcedureV3StatusCode"),
						new Object[] { plannedProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureV3EffectiveTime(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3EffectiveTime(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureV3EffectiveTime(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3EffectiveTime(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedureV3 The receiving '<em><b>Planned Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedureV3EffectiveTime(PlannedProcedureV3 plannedProcedureV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedProcedureV3PlannedProcedureV3EffectiveTime", "WARNING");

		if (VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_V3);
			try {
				VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_PROCEDURE_V3__PLANNED_PROCEDURE_V3_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("PlannedProcedureV3PlannedProcedureV3EffectiveTime"),
						new Object[] { plannedProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureV3MethodCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3MethodCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureV3MethodCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3MethodCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedureV3 The receiving '<em><b>Planned Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedureV3MethodCode(PlannedProcedureV3 plannedProcedureV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedProcedureV3PlannedProcedureV3MethodCode", "INFO");

		if (VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_V3);
			try {
				VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_PROCEDURE_V3__PLANNED_PROCEDURE_V3_METHOD_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedProcedureV3PlannedProcedureV3MethodCode"),
						new Object[] { plannedProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureV3TargetSiteCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3TargetSiteCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureV3TargetSiteCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureV3TargetSiteCode(PlannedProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedureV3 The receiving '<em><b>Planned Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedureV3TargetSiteCode(PlannedProcedureV3 plannedProcedureV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedProcedureV3PlannedProcedureV3TargetSiteCode", "INFO");

		if (VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_V3);
			try {
				VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_PROCEDURE_V3__PLANNED_PROCEDURE_V3_TARGET_SITE_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedProcedureV3PlannedProcedureV3TargetSiteCode"),
						new Object[] { plannedProcedureV3 }));
			}

			return false;
		}
		return true;
	}

} // PlannedProcedureV3Operations
