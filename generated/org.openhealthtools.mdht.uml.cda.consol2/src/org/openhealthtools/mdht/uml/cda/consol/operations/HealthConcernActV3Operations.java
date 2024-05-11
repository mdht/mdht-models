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
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concern Act V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthConcernActV3Operations extends ClinicalStatementOperations {

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
	protected HealthConcernActV3Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3TemplateId(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3TemplateId(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.132' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3TemplateId(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3TemplateId(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3TemplateId(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3TemplateId", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3TemplateId"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3Id(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3Id(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3Id(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3Id(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3Id(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3Id", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_ID,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3Id"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3StatusCodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3StatusCodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3StatusCodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3StatusCodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3StatusCodeP(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3StatusCodeP", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3StatusCodeP"),
						new Object[] { healthConcernActV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3StatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3StatusCodeP", passToken);
				}
				passToken.add(healthConcernActV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3StatusCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3StatusCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3StatusCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3StatusCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3StatusCode(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3StatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(healthConcernActV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3StatusCode", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3StatusCode"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3EffectiveTime(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3EffectiveTime(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3EffectiveTime(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3EffectiveTime(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3EffectiveTime(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3EffectiveTime", "INFO");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3EffectiveTime"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3ClassCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3ClassCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3ClassCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3ClassCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3ClassCode(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3ClassCode", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3ClassCode"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3MoodCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3MoodCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3MoodCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3MoodCode(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3MoodCode(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3MoodCode", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3MoodCode"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3CodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3CodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3CodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3CodeP(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3CodeP(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3CodeP", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_CODE_P,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3CodeP"),
						new Object[] { healthConcernActV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3CodeP", passToken);
				}
				passToken.add(healthConcernActV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActV3Code(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3Code(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '75310-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActV3Code(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActV3Code(HealthConcernActV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernActV3 The receiving '<em><b>Health Concern Act V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActV3Code(HealthConcernActV3 healthConcernActV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(healthConcernActV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "HealthConcernActV3HealthConcernActV3Code", "ERROR");

		if (VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT_V3);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(healthConcernActV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT_V3__HEALTH_CONCERN_ACT_V3_CODE,
						ConsolPlugin.INSTANCE.getString("HealthConcernActV3HealthConcernActV3Code"),
						new Object[] { healthConcernActV3 }));
			}

			return false;
		}
		return true;
	}

} // HealthConcernActV3Operations
