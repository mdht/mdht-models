/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3PriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3PriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityProcedureV3Operations extends ClinicalStatementOperations {

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
	protected ProcedureActivityProcedureV3Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3TemplateId(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3TemplateId(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.14' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3TemplateId(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3TemplateId(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3TemplateId(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3TemplateId", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3TemplateId"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3Id(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3Id(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3Id(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3Id(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3Id(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3Id", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_ID,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityProcedureV3ProcedureActivityProcedureV3Id"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3Code(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3Code(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3Code(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3Code(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3Code(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3Code", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureActivityProcedureV3ProcedureActivityProcedureV3Code"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3StatusCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3StatusCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3StatusCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3StatusCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3StatusCodeP(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3StatusCodeP", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3StatusCodeP"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3StatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3StatusCodeP", passToken);
				}
				passToken.add(procedureActivityProcedureV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3StatusCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3StatusCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3StatusCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3StatusCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3StatusCode(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3StatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureActivityProcedureV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3StatusCode", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3StatusCode"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3EffectiveTime(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3EffectiveTime(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3EffectiveTime(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3EffectiveTime(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3EffectiveTime(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3EffectiveTime", "WARNING");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3EffectiveTime"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3PriorityCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3PriorityCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3PriorityCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3PriorityCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3PriorityCodeP(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3PriorityCodeP", "INFO");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3PriorityCodeP"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3PriorityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3PriorityCodeP", passToken);
				}
				passToken.add(procedureActivityProcedureV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3PriorityCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3PriorityCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.7' and (value.code = 'A' or value.code = 'CR' or value.code = 'CS' or value.code = 'CSP' or value.code = 'CSR' or value.code = 'EL' or value.code = 'EM' or value.code = 'P' or value.code = 'PRN' or value.code = 'R' or value.code = 'RR' or value.code = 'S' or value.code = 'T' or value.code = 'UD' or value.code = 'UR'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3PriorityCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3PriorityCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3PriorityCode(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3PriorityCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureActivityProcedureV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3PriorityCode", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3PriorityCode"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3MethodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3MethodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3MethodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3MethodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3MethodCode(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3MethodCode", "INFO");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3MethodCode"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3TargetSiteCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3TargetSiteCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3TargetSiteCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3TargetSiteCodeP(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3TargetSiteCodeP(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3TargetSiteCodeP", "WARNING");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3TargetSiteCodeP"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3TargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3TargetSiteCodeP",
						passToken);
				}
				passToken.add(procedureActivityProcedureV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3TargetSiteCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3TargetSiteCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3TargetSiteCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3TargetSiteCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3TargetSiteCode(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3TargetSiteCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureActivityProcedureV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3TargetSiteCode", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3TargetSiteCode"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3ClassCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3ClassCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3ClassCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3ClassCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3ClassCode(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3ClassCode", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3ClassCode"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureV3MoodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3MoodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureV3MoodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureV3MoodCode(ProcedureActivityProcedureV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityProcedureV3 The receiving '<em><b>Procedure Activity Procedure V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureV3MoodCode(
			ProcedureActivityProcedureV3 procedureActivityProcedureV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureActivityProcedureV3ProcedureActivityProcedureV3MoodCode", "ERROR");

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityProcedureV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_PROCEDURE_V3__PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityProcedureV3ProcedureActivityProcedureV3MoodCode"),
						new Object[] { procedureActivityProcedureV3 }));
			}

			return false;
		}
		return true;
	}

} // ProcedureActivityProcedureV3Operations
